package zn2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import okhttp3.Response;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzn2/u0;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f205864a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z53.b f205865b = z53.c.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.t f205866c = o13.m.b(new zd0.r0(14));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wr2.s<ao2.a> f205867d = new wr2.s<>(new zd0.r0(15));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wr2.s<ao2.a> f205868e = new wr2.s<>(new zd0.r0(16));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final wr2.s<mn2.k> f205869f = new wr2.s<>(new zd0.r0(17));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wr2.s<ao2.a> f205870g = new wr2.s<>(new zd0.r0(18));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements u03.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f205871a;

        public a(e23.l lVar) {
            lVar.getClass();
            this.f205871a = lVar;
        }

        @Override // u03.d
        public final /* synthetic */ void accept(Object obj) {
            this.f205871a.invoke(obj);
        }
    }

    private u0() {
    }

    public static e13.j f() {
        i().debug("getFitPayUser called");
        q03.r<c83.a0<sn2.b>> rVarD = h().d();
        xw.b bVar = new xw.b(new z81.b(16), 15);
        rVarD.getClass();
        int i14 = w03.b.f181178a;
        return new e13.j(rVarD, bVar);
    }

    public static ao2.a g() {
        return f205868e.getValue();
    }

    public static mn2.k h() {
        return f205869f.getValue();
    }

    public static Logger i() {
        return (Logger) f205866c.getValue();
    }

    public static Object o(long j8, v13.c cVar) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(cVar), 1);
        kVar.q();
        f205864a.getClass();
        q03.r<c83.a0<Unit>> rVarC = h().c(j8);
        q03.q qVar = l13.a.f108327b;
        rVarC.j(qVar).g(qVar).h(new a(new s0(j8, kVar)), new a(new t0(kVar)));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        b0 b0Var;
        z53.b bVar;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f205425d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f205425d = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object obj = b0Var.f205423b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f205425d;
        if (i15 == 0) {
            o13.r.b(obj);
            z53.b bVar2 = f205865b;
            b0Var.f205422a = bVar2;
            b0Var.f205425d = 1;
            if (bVar2.c(b0Var) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = b0Var.f205422a;
            o13.r.b(obj);
        }
        try {
            f205868e.a();
            f205869f.a();
            f205870g.a();
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:45:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x013a -> B:48:0x013d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x016f -> B:58:0x0170). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r23, java.lang.Iterable r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, v13.c r29) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.u0.b(java.lang.String, java.lang.Iterable, java.lang.String, java.lang.String, boolean, boolean, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c9 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.lang.String r13, v13.c r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.u0.c(java.lang.String, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v13.c cVar) throws NewFitPayException {
        g0 g0Var;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f205524c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f205524c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object objK = g0Var.f205522a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f205524c;
        if (i15 == 0) {
            o13.r.b(objK);
            ao2.a aVarG = g();
            g0Var.f205524c = 1;
            objK = aVarG.K(str, g0Var);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        c83.a0 a0Var = (c83.a0) objK;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.code() != 200) {
            throw new NewFitPayException("getDevice: failed to get target fitPay device " + response.code() + " : " + obj, z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
        }
        fo2.s sVar = (fo2.s) obj;
        if (sVar != null) {
            return sVar;
        }
        throw new NewFitPayException("getDevice: failed to get target fitPay device " + response.code() + " : " + obj, z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(int i14, String str, v13.c cVar) throws NewFitPayException {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i15 = h0Var.f205566c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                h0Var.f205566c = i15 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objT = h0Var.f205564a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = h0Var.f205566c;
        if (i16 == 0) {
            o13.r.b(objT);
            ao2.a aVarG = g();
            h0Var.f205566c = 1;
            objT = aVarG.T(str, 0, i14, h0Var);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objT);
        }
        c83.a0 a0Var = (c83.a0) objT;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.code() != 200) {
            throw new NewFitPayException("getDevices: failed to get fitPay devices " + response.code() + " : " + obj, z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
        }
        fo2.v vVar = (fo2.v) obj;
        if (vVar != null) {
            return vVar;
        }
        throw new NewFitPayException("getDevices: failed to get fitPay devices " + response.code() + " : " + obj, z.UNABLE_TO_LOAD_DEVICE, null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x0115 A[LOOP:0: B:22:0x00a8->B:43:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e4 -> B:34:0x00e7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object j(java.lang.String r19, java.util.Set r20, v13.c r21) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.u0.j(java.lang.String, java.util.Set, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c9 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(@i83.y java.lang.String r13, v13.c r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.u0.k(java.lang.String, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c9 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(java.lang.String r12, fo2.j0 r13, v13.c r14) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.u0.l(java.lang.String, fo2.j0, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, v13.c cVar) {
        o0 o0Var;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i14 = o0Var.f205710c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o0Var.f205710c = i14 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objT = o0Var.f205708a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = o0Var.f205710c;
        if (i15 == 0) {
            o13.r.b(objT);
            ao2.a aVarG = g();
            o0Var.f205710c = 1;
            objT = aVarG.t(str, o0Var);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objT);
        }
        c83.a0 a0Var = (c83.a0) objT;
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.code() != 200) {
            throw new NewFitPayException("getUser: failed to get fitPay user " + response.code() + " : " + obj, null, null, 6, null);
        }
        fo2.u uVar = (fo2.u) obj;
        if (uVar != null) {
            return uVar;
        }
        throw new NewFitPayException("getUser: failed to get fitPay user " + response.code() + " : " + obj, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c9 -> B:34:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(java.lang.String r12, java.lang.String r13, v13.c r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zn2.u0.n(java.lang.String, java.lang.String, v13.c):java.lang.Object");
    }
}
