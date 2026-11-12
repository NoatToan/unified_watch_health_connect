package u7;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu7/q1;", "Lu7/t0;", "", "filePath", "<init>", "(Ljava/lang/String;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q1 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z53.b f169299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f169300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f169301c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr53/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<r53.j<? super Unit>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super Unit> jVar, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
    }

    public q1(String str) {
        str.getClass();
        this.f169299a = z53.c.a();
        this.f169300b = new b(0);
        this.f169301c = new c2(new a(null));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u7.t0
    public final Object a(e23.p pVar, v13.c cVar) throws Throwable {
        p1 p1Var;
        z53.b bVar;
        Throwable th3;
        boolean z14;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i14 = p1Var.f169293e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p1Var.f169293e = i14 - Integer.MIN_VALUE;
            } else {
                p1Var = new p1(this, cVar);
            }
        } else {
            p1Var = new p1(this, cVar);
        }
        Object obj = p1Var.f169291c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p1Var.f169293e;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = p1Var.f169290b;
            bVar = p1Var.f169289a;
            try {
                o13.r.b(obj);
                if (z14) {
                    bVar.e(null);
                }
                return obj;
            } catch (Throwable th4) {
                th3 = th4;
                if (z14) {
                    bVar.e(null);
                }
                throw th3;
            }
        }
        o13.r.b(obj);
        z53.b bVar2 = this.f169299a;
        boolean zF = bVar2.f();
        try {
            Boolean boolValueOf = Boolean.valueOf(zF);
            p1Var.f169289a = bVar2;
            p1Var.f169290b = zF;
            p1Var.f169293e = 1;
            Object objInvoke = pVar.invoke(boolValueOf, p1Var);
            if (objInvoke == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj = objInvoke;
            z14 = zF;
            if (z14) {
                bVar.e(null);
            }
            return obj;
        } catch (Throwable th5) {
            bVar = bVar2;
            th3 = th5;
            z14 = zF;
            if (z14) {
                bVar.e(null);
            }
            throw th3;
        }
    }

    @Override // u7.t0
    public final Object b(g0 g0Var) {
        return new Integer(this.f169300b.f169086a.incrementAndGet());
    }

    @Override // u7.t0
    public final r53.i<Unit> c() {
        return this.f169301c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // u7.t0
    public final Object d(e23.l lVar, v13.c cVar) throws Throwable {
        o1 o1Var;
        z53.b bVar;
        Throwable th3;
        z53.a aVar;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i14 = o1Var.f169270e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                o1Var.f169270e = i14 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object obj = o1Var.f169268c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = o1Var.f169270e;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                o1Var.f169266a = lVar;
                bVar = this.f169299a;
                o1Var.f169267b = bVar;
                o1Var.f169270e = 1;
                if (bVar.c(o1Var) != aVar2) {
                }
                return aVar2;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (z53.a) o1Var.f169266a;
                try {
                    o13.r.b(obj);
                    aVar.e(null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar.e(null);
                    throw th3;
                }
            }
            z53.b bVar2 = o1Var.f169267b;
            e23.l lVar2 = (e23.l) o1Var.f169266a;
            o13.r.b(obj);
            bVar = bVar2;
            lVar = lVar2;
            o1Var.f169266a = bVar;
            o1Var.f169267b = null;
            o1Var.f169270e = 2;
            Object objInvoke = lVar.invoke(o1Var);
            if (objInvoke != aVar2) {
                z53.b bVar3 = bVar;
                obj = objInvoke;
                aVar = bVar3;
                aVar.e(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th5) {
            z53.b bVar4 = bVar;
            th3 = th5;
            aVar = bVar4;
            aVar.e(null);
            throw th3;
        }
    }

    @Override // u7.t0
    public final Object e(v13.c cVar) {
        return new Integer(this.f169300b.f169086a.get());
    }
}
