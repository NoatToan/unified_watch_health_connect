package ve;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import o53.l1;
import o53.m1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lve/y0;", "", "Lve/y0$a;", "builder", "<init>", "(Lve/y0$a;)V", "b", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf.t f177633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f177634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f177635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f177636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ef.b f177637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.work.a f177638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ue.b f177639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bf.a f177640h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WorkDatabase f177641i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cf.u f177642j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final cf.b f177643k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<String> f177644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f177645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1 f177646n;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lve/y0$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/a;", "configuration", "Lef/b;", "workTaskExecutor", "Lbf/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Lcf/t;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;Lef/b;Lbf/a;Landroidx/work/impl/WorkDatabase;Lcf/t;Ljava/util/List;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.work.a f177647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ef.b f177648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bf.a f177649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WorkDatabase f177650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final cf.t f177651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<String> f177652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Context f177653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public WorkerParameters.a f177654h;

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.a aVar, ef.b bVar, bf.a aVar2, WorkDatabase workDatabase, cf.t tVar, List<String> list) {
            context.getClass();
            aVar.getClass();
            bVar.getClass();
            aVar2.getClass();
            workDatabase.getClass();
            tVar.getClass();
            list.getClass();
            this.f177647a = aVar;
            this.f177648b = bVar;
            this.f177649c = aVar2;
            this.f177650d = workDatabase;
            this.f177651e = tVar;
            this.f177652f = list;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            this.f177653g = applicationContext;
            this.f177654h = new WorkerParameters.a();
        }
    }

    public y0(a aVar) {
        aVar.getClass();
        cf.t tVar = aVar.f177651e;
        this.f177633a = tVar;
        this.f177634b = aVar.f177653g;
        String str = tVar.f26941a;
        this.f177635c = str;
        this.f177636d = aVar.f177654h;
        this.f177637e = aVar.f177648b;
        androidx.work.a aVar2 = aVar.f177647a;
        this.f177638f = aVar2;
        this.f177639g = aVar2.f11438d;
        this.f177640h = aVar.f177649c;
        WorkDatabase workDatabase = aVar.f177650d;
        this.f177641i = workDatabase;
        this.f177642j = workDatabase.j();
        this.f177643k = workDatabase.e();
        List<String> list = aVar.f177652f;
        this.f177644l = list;
        this.f177645m = am.j.o(p13.h0.k0(list, ",", null, null, null, 62), " } ]", hb.a.l("Work [ id=", str, ", tags={ "));
        this.f177646n = g8.i.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.work.d$a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static final Object a(final y0 y0Var, v13.c cVar) {
        a1 a1Var;
        a1 a1Var2;
        ue.o oVar;
        boolean z14;
        androidx.work.c cVarA;
        String str = y0Var.f177645m;
        String str2 = y0Var.f177635c;
        ef.b bVar = y0Var.f177637e;
        WorkDatabase workDatabase = y0Var.f177641i;
        androidx.work.a aVar = y0Var.f177638f;
        ue.d dVar = aVar.f11448n;
        cf.t tVar = y0Var.f177633a;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i14 = a1Var.f177542c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a1Var.f177542c = i14 - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(y0Var, cVar);
            }
        } else {
            a1Var = new a1(y0Var, cVar);
        }
        Object objE0 = a1Var.f177540a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = a1Var.f177542c;
        int i16 = 1;
        i16 = 1;
        ?? r14 = 0;
        r14 = 0;
        try {
            if (i15 == 0) {
                o13.r.b(objE0);
                boolean zC = dVar.c();
                String str3 = tVar.f26964x;
                String str4 = tVar.f26944d;
                String str5 = tVar.f26943c;
                if (!zC || str3 == null) {
                    a1Var2 = a1Var;
                } else {
                    int iHashCode = tVar.hashCode();
                    dVar.getClass();
                    str3.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        ce.b.a(iHashCode, ce.a.d(str3));
                        a1Var2 = a1Var;
                    } else {
                        String strD = ce.a.d(str3);
                        try {
                            if (ce.a.f26884c == null) {
                                a1Var2 = a1Var;
                                try {
                                    ce.a.f26884c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                } catch (Exception e4) {
                                    e = e4;
                                    ce.a.a(e);
                                }
                            } else {
                                a1Var2 = a1Var;
                            }
                            ce.a.f26884c.invoke(null, Long.valueOf(ce.a.f26882a), strD, Integer.valueOf(iHashCode));
                        } catch (Exception e14) {
                            e = e14;
                            a1Var2 = a1Var;
                        }
                    }
                }
                final int i17 = 0;
                if (((Boolean) workDatabase.runInTransaction(new Callable(y0Var) { // from class: ve.x0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ y0 f177630b;

                    {
                        this.f177630b = y0Var;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z15;
                        int i18 = i17;
                        y0 y0Var2 = this.f177630b;
                        switch (i18) {
                            case 0:
                                cf.t tVar2 = y0Var2.f177633a;
                                ue.h0.c cVar2 = tVar2.f26942b;
                                ue.h0.c cVar3 = ue.h0.c.ENQUEUED;
                                if (cVar2 != cVar3) {
                                    int i19 = d1.f177564a;
                                    ue.u.a().getClass();
                                    return Boolean.TRUE;
                                }
                                if ((!tVar2.c() && (tVar2.f26942b != cVar3 || tVar2.f26951k <= 0)) || y0Var2.f177639g.currentTimeMillis() >= tVar2.a()) {
                                    return Boolean.FALSE;
                                }
                                ue.u uVarA = ue.u.a();
                                int i24 = d1.f177564a;
                                uVarA.getClass();
                                return Boolean.TRUE;
                            default:
                                cf.u uVar = y0Var2.f177642j;
                                String str6 = y0Var2.f177635c;
                                if (uVar.c(str6) == ue.h0.c.ENQUEUED) {
                                    uVar.h(str6, ue.h0.c.RUNNING);
                                    uVar.C(str6);
                                    uVar.setStopReason(str6, -256);
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                return Boolean.valueOf(z15);
                        }
                    }
                })).booleanValue()) {
                    return new b.c(i17, 1, null);
                }
                if (tVar.c()) {
                    cVarA = tVar.f26945e;
                    z14 = true;
                } else {
                    ue.p pVar = aVar.f11440f;
                    pVar.getClass();
                    str4.getClass();
                    pVar.a(str4);
                    int i18 = ue.q.f170114a;
                    try {
                        Object objNewInstance = Class.forName(str4).getDeclaredConstructor(null).newInstance(null);
                        objNewInstance.getClass();
                        oVar = (ue.o) objNewInstance;
                    } catch (Exception unused) {
                        ue.u uVarA = ue.u.a();
                        int i19 = ue.q.f170114a;
                        "Trouble instantiating ".concat(str4);
                        uVarA.getClass();
                        oVar = null;
                    }
                    if (oVar == null) {
                        int i24 = d1.f177564a;
                        ue.u.a().getClass();
                        return new b.a(null, 1, 0 == true ? 1 : 0);
                    }
                    z14 = true;
                    cVarA = oVar.a(p13.h0.C0(p13.w.c(tVar.f26945e), y0Var.f177642j.e(str2)));
                }
                androidx.work.c cVar2 = cVarA;
                boolean z15 = z14;
                int i25 = 0;
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(str2), cVar2, y0Var.f177644l, y0Var.f177636d, tVar.f26951k, tVar.f26960t, aVar.f11435a, aVar.f11436b, bVar, aVar.f11439e, new df.y(workDatabase, bVar), new df.x(workDatabase, y0Var.f177640h, bVar));
                try {
                    androidx.work.d dVarB = aVar.f11439e.b(y0Var.f177634b, str5, workerParameters);
                    dVarB.f11472d = z15;
                    t13.g.a aVar3 = a1Var2.getF157466b().get(l1.f129368i0);
                    aVar3.getClass();
                    l1 l1Var = (l1) aVar3;
                    i16 = z15 ? 1 : 0;
                    l1Var.J(new dt1.d(dVarB, zC, str3, y0Var, 6));
                    final int i26 = i16 == true ? 1 : 0;
                    Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(y0Var) { // from class: ve.x0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ y0 f177630b;

                        {
                            this.f177630b = y0Var;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z16;
                            int i110 = i26;
                            y0 y0Var2 = this.f177630b;
                            switch (i110) {
                                case 0:
                                    cf.t tVar2 = y0Var2.f177633a;
                                    ue.h0.c cVar3 = tVar2.f26942b;
                                    ue.h0.c cVar4 = ue.h0.c.ENQUEUED;
                                    if (cVar3 != cVar4) {
                                        int i111 = d1.f177564a;
                                        ue.u.a().getClass();
                                        return Boolean.TRUE;
                                    }
                                    if ((!tVar2.c() && (tVar2.f26942b != cVar4 || tVar2.f26951k <= 0)) || y0Var2.f177639g.currentTimeMillis() >= tVar2.a()) {
                                        return Boolean.FALSE;
                                    }
                                    ue.u uVarA2 = ue.u.a();
                                    int i27 = d1.f177564a;
                                    uVarA2.getClass();
                                    return Boolean.TRUE;
                                default:
                                    cf.u uVar = y0Var2.f177642j;
                                    String str6 = y0Var2.f177635c;
                                    if (uVar.c(str6) == ue.h0.c.ENQUEUED) {
                                        uVar.h(str6, ue.h0.c.RUNNING);
                                        uVar.C(str6);
                                        uVar.setStopReason(str6, -256);
                                        z16 = true;
                                    } else {
                                        z16 = false;
                                    }
                                    return Boolean.valueOf(z16);
                            }
                        }
                    });
                    objRunInTransaction.getClass();
                    if (!((Boolean) objRunInTransaction).booleanValue()) {
                        return new b.c(i25, i16 == true ? 1 : 0, null);
                    }
                    r14 = 0;
                    ?? r15 = 0;
                    if (l1Var.isCancelled()) {
                        return new b.c(i25, i16 == true ? 1 : 0, r15 == true ? 1 : 0);
                    }
                    ue.n nVar = workerParameters.f11432g;
                    nVar.getClass();
                    ef.c.a aVarC = bVar.c();
                    aVarC.getClass();
                    o53.z zVarO = gl1.y.o(aVarC);
                    b1 b1Var = new b1(y0Var, dVarB, nVar, null);
                    a1 a1Var3 = a1Var2;
                    a1Var3.f177542c = i16 == true ? 1 : 0;
                    objE0 = ge1.b.e0(zVarO, b1Var, a1Var3);
                    if (objE0 == aVar2) {
                        return aVar2;
                    }
                } catch (Throwable unused2) {
                    int i27 = d1.f177564a;
                    ue.u.a().getClass();
                    return new b.a(null, z15 ? 1 : 0, 0 == true ? 1 : 0);
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            androidx.work.d.a aVar4 = (androidx.work.d.a) objE0;
            aVar4.getClass();
            return new b.C3318b(aVar4);
        } catch (CancellationException e15) {
            int i28 = d1.f177564a;
            ue.u.a().getClass();
            throw e15;
        } catch (Throwable unused3) {
            int i29 = d1.f177564a;
            ue.u.a().getClass();
            return new b.a(r14, i16, r14);
        }
    }

    public final void b(int i14) {
        ue.h0.c cVar = ue.h0.c.ENQUEUED;
        cf.u uVar = this.f177642j;
        String str = this.f177635c;
        uVar.h(str, cVar);
        uVar.p(this.f177639g.currentTimeMillis(), str);
        uVar.w(this.f177633a.f26962v, str);
        uVar.u(-1L, str);
        uVar.setStopReason(str, i14);
    }

    public final void c() {
        long jCurrentTimeMillis = this.f177639g.currentTimeMillis();
        cf.u uVar = this.f177642j;
        String str = this.f177635c;
        uVar.p(jCurrentTimeMillis, str);
        uVar.h(str, ue.h0.c.ENQUEUED);
        uVar.g(str);
        uVar.w(this.f177633a.f26962v, str);
        uVar.t(str);
        uVar.u(-1L, str);
    }

    public final void d(androidx.work.d.a aVar) {
        aVar.getClass();
        String str = this.f177635c;
        ArrayList arrayListM = p13.x.m(str);
        while (true) {
            boolean zIsEmpty = arrayListM.isEmpty();
            cf.u uVar = this.f177642j;
            if (zIsEmpty) {
                androidx.work.c cVar = ((androidx.work.d.a.C0165a) aVar).f11473a;
                cVar.getClass();
                uVar.w(this.f177633a.f26962v, str);
                uVar.k(str, cVar);
                return;
            }
            String str2 = (String) p13.d0.F(arrayListM);
            if (uVar.c(str2) != ue.h0.c.CANCELLED) {
                uVar.h(str2, ue.h0.c.FAILED);
            }
            arrayListM.addAll(this.f177643k.a(str2));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lve/y0$b;", "", "<init>", "()V", "c", "a", "b", "Lve/y0$b$a;", "Lve/y0$b$b;", "Lve/y0$b$c;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: ve.y0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve/y0$b$b;", "Lve/y0$b;", "Landroidx/work/d$a;", "result", "<init>", "(Landroidx/work/d$a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C3318b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.d.a f177656a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3318b(androidx.work.d.a aVar) {
                super(null);
                aVar.getClass();
                this.f177656a = aVar;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve/y0$b$c;", "Lve/y0$b;", "", "reason", "<init>", "(I)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f177657a;

            public /* synthetic */ c(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
                this((i15 & 1) != 0 ? -256 : i14);
            }

            public c(int i14) {
                super(null);
                this.f177657a = i14;
            }

            public c() {
                this(0, 1, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lve/y0$b$a;", "Lve/y0$b;", "Landroidx/work/d$a;", "result", "<init>", "(Landroidx/work/d$a;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.d.a f177655a;

            public /* synthetic */ a(androidx.work.d.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
                this((i14 & 1) != 0 ? new androidx.work.d.a.C0165a() : aVar);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.work.d.a aVar) {
                super(null);
                aVar.getClass();
                this.f177655a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }
    }
}
