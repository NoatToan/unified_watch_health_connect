package zs2;

import bs2.b7;
import bs2.ck;
import bs2.v5;
import bs2.z3;
import com.garmin.fit.FitRuntimeException;
import com.garmin.gfdi.ResponseStatusException;
import com.garmin.gfdi.fit.FITHandlerException;
import e23.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import o13.r;
import o53.b0;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.l0;
import p13.u;
import r1.q2;
import rs2.v;
import rs2.w;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lzs2/h;", "Lrs2/w;", "Lrs2/h;", "Lrs2/v;", "messenger", "<init>", "(Lrs2/v;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements w, rs2.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f206893f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f206894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f206895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ck f206896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f206897e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.fit.FITHandler$onMessageReceived$1", f = "FITHandler.kt", l = {101}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f206899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f206900c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f206901d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f206902e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, int i14, h hVar, int i15, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f206899b = xVar;
            this.f206900c = i14;
            this.f206901d = hVar;
            this.f206902e = i15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f206899b, this.f206900c, this.f206901d, this.f206902e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206898a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    x xVar = this.f206899b;
                    y yVar = y.ACK;
                    byte[] bArr = {(byte) this.f206900c};
                    this.f206898a = 1;
                    if (xVar.a(yVar, bArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (IOException e4) {
                this.f206901d.f206895c.error("Failed to send FIT response (" + this.f206902e + ")", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public h(v vVar) {
        vVar.getClass();
        this.f206894b = vVar;
        rs2.d.f154380a.getClass();
        this.f206895c = LoggerFactory.getLogger(rs2.d.a("FITHandler", -1L, this, null));
        b7 b7Var = new b7();
        this.f206896d = new ck(b7Var);
        this.f206897e = q2.l("FITHandler");
        b7Var.g();
        if (b7Var.f19710v != null) {
            throw new FitRuntimeException("Can't set incompleteStream option after Decode started!");
        }
        b7Var.f19711w = false;
        vVar.d(5011, this);
        vVar.d(5012, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(int i14, byte[] bArr, v13.c cVar) throws FITHandlerException {
        i iVar;
        String str;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i15 = iVar.f206906d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                iVar.f206906d = i15 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f206904b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = iVar.f206906d;
        if (i16 == 0) {
            r.b(obj);
            String str2 = i14 == 5012 ? "message" : "definition";
            try {
                v vVar = this.f206894b;
                iVar.f206903a = str2;
                iVar.f206906d = 1;
                Object objB = vVar.b(i14, bArr, iVar);
                if (objB == aVar) {
                    return aVar;
                }
                String str3 = str2;
                obj = objB;
                str = str3;
            } catch (ResponseStatusException e4) {
                e = e4;
                str = str2;
                throw new FITHandlerException(fb1.c.n("Device failed to receive ", str), e);
            } catch (IOException e14) {
                e = e14;
                str = str2;
                throw new FITHandlerException(fb1.c.n("Failed to send ", str), e);
            } catch (CancellationException e15) {
                e = e15;
                str = str2;
                throw new FITHandlerException(tn.k.g(str, " send cancelled"), e);
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = iVar.f206903a;
            try {
                r.b(obj);
            } catch (ResponseStatusException e16) {
                e = e16;
                throw new FITHandlerException(fb1.c.n("Device failed to receive ", str), e);
            } catch (IOException e17) {
                e = e17;
                throw new FITHandlerException(fb1.c.n("Failed to send ", str), e);
            } catch (CancellationException e18) {
                e = e18;
                throw new FITHandlerException(tn.k.g(str, " send cancelled"), e);
            }
        }
        Byte bF = u.F((byte[]) obj);
        Integer num = bF != null ? new Integer(bF.byteValue()) : null;
        if (num != null && num.intValue() == 0) {
            return Unit.INSTANCE;
        }
        throw new FITHandlerException("Invalid FIT " + str + " response status: " + num, null, 2, null);
    }

    public final Object b(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, v13.i iVar) throws IOException, FITHandlerException {
        v5 v5Var = new v5();
        v5Var.o(0);
        z3 z3Var = z3.TRUE;
        v5Var.n(0, Short.valueOf(z3Var.f20708a));
        short s8 = z3Var.f20708a;
        v5Var.n(1, Short.valueOf(s8));
        v5Var.n(2, Short.valueOf(z3.INVALID.f20708a));
        v5Var.n(8, Short.valueOf(s8));
        v5Var.n(9, Short.valueOf(s8));
        v5Var.n(10, Short.valueOf(s8));
        v5Var.n(7, Short.valueOf((z14 ? z3Var : z3.FALSE).f20708a));
        v5Var.n(4, Short.valueOf((z15 ? z3Var : z3.FALSE).f20708a));
        v5Var.n(5, Short.valueOf((z18 ? z3Var : z3.FALSE).f20708a));
        v5Var.n(6, Short.valueOf((z17 ? z3Var : z3.FALSE).f20708a));
        if (!z16) {
            z3Var = z3.FALSE;
        }
        v5Var.n(13, Short.valueOf(z3Var.f20708a));
        List listAsList = Arrays.asList(v5Var);
        listAsList.getClass();
        Object objE = e(listAsList, iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objE != aVar) {
            objE = Unit.INSTANCE;
        }
        return objE == aVar ? objE : Unit.INSTANCE;
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        c0.d(this.f206897e, "FITHandler closed");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0230 -> B:109:0x0252). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x024f -> B:109:0x0252). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:80:0x01ae
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final java.lang.Object e(java.util.List r18, v13.c r19) throws java.io.IOException, com.garmin.gfdi.fit.FITHandlerException {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs2.h.e(java.util.List, v13.c):java.lang.Object");
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        int i15;
        bArr.getClass();
        if (i14 == 5011 || i14 == 5012) {
            try {
                this.f206896d.c(new ByteArrayInputStream(bArr));
                i15 = 0;
            } catch (FitRuntimeException e4) {
                this.f206895c.error("FIT Runtime Exception", (Throwable) e4);
                i15 = 3;
            }
            ft2.d.b(this.f206897e, new b(xVar, i15, this, i14, null));
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lzs2/h$a;", "", "<init>", "()V", "", "FIT_STATUS_APPLIED", "I", "FIT_STATUS_NOT_READY", "FIT_LOCAL_NUMBER_CONNECTIVITY", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
