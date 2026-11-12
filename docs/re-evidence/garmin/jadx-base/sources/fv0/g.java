package fv0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import java.util.List;
import kd0.c6;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r53.b2;
import r53.p2;
import r53.q2;
import wd2.a2;
import wd2.g2;
import wd2.q;
import wd2.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfv0/g;", "Landroidx/lifecycle/u1;", "", "deviceId", "Luu0/h;", "getLiveTrackPlusDataUseCase", "<init>", "(JLuu0/h;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f73641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uu0.h f73642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uu0.a f73643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f73644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f73645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f73646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f73647g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsViewModel$1", f = "SessionDetailsViewModel.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73648a;

        /* JADX INFO: renamed from: fv0.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lou0/d;", "data", "", "<anonymous>", "(Lou0/d;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsViewModel$1$1", f = "SessionDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1490a extends v13.i implements p<ou0.d, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f73650a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f73651b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1490a(g gVar, t13.d<? super C1490a> dVar) {
                super(2, dVar);
                this.f73651b = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1490a c1490a = new C1490a(this.f73651b, dVar);
                c1490a.f73650a = obj;
                return c1490a;
            }

            @Override // e23.p
            public final Object invoke(ou0.d dVar, t13.d<? super Unit> dVar2) {
                return ((C1490a) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                ou0.d dVar = (ou0.d) this.f73650a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f73651b.f73646f.setValue(dVar);
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r53.s.k((r53.i) r6, r1, r5) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73648a;
            g gVar = g.this;
            if (i14 == 0) {
                r.b(obj);
                uu0.h hVar = gVar.f73642b;
                this.f73648a = 1;
                obj = hVar.b(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            C1490a c1490a = new C1490a(gVar, null);
            this.f73648a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsViewModel$2", f = "SessionDetailsViewModel.kt", l = {87, 98, 99, 100}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ou0.e f73652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j0 f73653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i0 f73654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f73655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f73656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f73657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f73658g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lpu0/a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsViewModel$2$connectionsJob$1", f = "SessionDetailsViewModel.kt", l = {91, 92}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super List<? extends pu0.a>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f73660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ou0.e f73661b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ou0.e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f73661b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f73661b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super List<? extends pu0.a>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
            
                if (r6 == r0) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
            
                if (r6 == r0) goto L25;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f73660a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return (List) obj;
                    }
                    if (i14 == 2) {
                        r.b(obj);
                        return (List) obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                ou0.f fVar = this.f73661b.f133979b;
                ou0.b bVar = fVar != null ? fVar.f133984b : null;
                if (s.g(bVar, ou0.b.a.f133961a)) {
                    su0.h hVar = su0.h.f160962a;
                    this.f73660a = 1;
                    obj = hVar.b(this);
                } else {
                    if (!s.g(bVar, ou0.b.C2540b.f133962a)) {
                        return null;
                    }
                    su0.h hVar2 = su0.h.f160962a;
                    this.f73660a = 2;
                    obj = hVar2.c(this);
                }
                return aVar;
            }
        }

        /* JADX INFO: renamed from: fv0.g$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwd2/g2;", "<anonymous>", "(Lo53/b0;)Lwd2/g2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.sessiondetails.SessionDetailsViewModel$2$stravaOptionJob$1", f = "SessionDetailsViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
        public static final class C1491b extends v13.i implements p<b0, t13.d<? super g2>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f73662a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f73663b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1491b(g gVar, t13.d<? super C1491b> dVar) {
                super(2, dVar);
                this.f73663b = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1491b(this.f73663b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super g2> dVar) {
                return ((C1491b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f73662a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                c6 c6VarD = this.f73663b.f73643c.d();
                this.f73662a = 1;
                Object objA = c6VarD.a(false, this);
                return objA == aVar ? aVar : objA;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = g.this.new b(dVar);
            bVar.f73658g = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:39:0x0107  */
        /* JADX WARN: Code duplicated, block: B:43:0x011d  */
        /* JADX WARN: Code duplicated, block: B:44:0x012d  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objC;
            j0 j0VarJ;
            i0 i0VarJ;
            Object objC2;
            ou0.e eVar;
            List list;
            Object objAwait;
            i0 i0Var;
            List list2;
            List list3;
            Object objAwait2;
            List list4;
            List list5;
            ou0.e eVar2;
            g2 g2Var;
            p2 p2Var;
            Object value2;
            ou0.f fVar;
            ou0.f fVarA;
            ou0.e eVarA;
            b0 b0Var = (b0) this.f73658g;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73657f;
            g gVar = g.this;
            if (i14 == 0) {
                r.b(obj);
                p2 p2Var2 = gVar.f73644d;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, g3.a.c(g3.f35298f)));
                long j8 = gVar.f73641a;
                this.f73658g = b0Var;
                this.f73657f = 1;
                objC = q.f184563f.c().c(j8, this);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
                objC = obj;
            } else {
                if (i14 == 2) {
                    i0VarJ = this.f73654c;
                    j0 j0Var = this.f73653b;
                    eVar = this.f73652a;
                    r.b(obj);
                    j0VarJ = j0Var;
                    objC2 = obj;
                    list = (List) objC2;
                    this.f73658g = null;
                    this.f73652a = eVar;
                    this.f73653b = null;
                    this.f73654c = i0VarJ;
                    this.f73655d = list;
                    this.f73657f = 3;
                    objAwait = j0VarJ.await(this);
                    if (objAwait != aVar) {
                        i0Var = i0VarJ;
                        list2 = list;
                        list3 = (List) objAwait;
                        this.f73658g = null;
                        this.f73652a = eVar;
                        this.f73653b = null;
                        this.f73654c = null;
                        this.f73655d = list2;
                        this.f73656e = list3;
                        this.f73657f = 4;
                        objAwait2 = i0Var.await(this);
                        if (objAwait2 != aVar) {
                            list4 = list2;
                            list5 = list3;
                            eVar2 = eVar;
                        }
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    list2 = this.f73655d;
                    i0Var = this.f73654c;
                    ou0.e eVar3 = this.f73652a;
                    r.b(obj);
                    eVar = eVar3;
                    objAwait = obj;
                    list3 = (List) objAwait;
                    this.f73658g = null;
                    this.f73652a = eVar;
                    this.f73653b = null;
                    this.f73654c = null;
                    this.f73655d = list2;
                    this.f73656e = list3;
                    this.f73657f = 4;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar) {
                        list4 = list2;
                        list5 = list3;
                        eVar2 = eVar;
                    }
                    return aVar;
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list6 = this.f73656e;
                List list7 = this.f73655d;
                ou0.e eVar4 = this.f73652a;
                r.b(obj);
                list5 = list6;
                list4 = list7;
                eVar2 = eVar4;
                objAwait2 = obj;
            }
            g2Var = (g2) objAwait2;
            p2Var = gVar.f73644d;
            do {
                value2 = p2Var.getValue();
                g3.a aVar2 = g3.f35298f;
                fVar = eVar2.f133979b;
                if (fVar != null) {
                    fVarA = ou0.f.a(fVar, null, null, g2Var, null, null, 59);
                } else {
                    fVarA = null;
                }
                eVarA = ou0.e.a(eVar2, null, fVarA, list4, list5, 5);
                aVar2.getClass();
            } while (!p2Var.b(value2, g3.a.d(eVarA)));
            return Unit.INSTANCE;
            a2 a2Var = (a2) objC;
            a2Var.getClass();
            z1 z1Var = a2Var.f184384a;
            ou0.e eVar5 = new ou0.e(z1Var != null ? z1Var.f184694b : null, ou0.a.a(a2Var.f184385b), z1Var != null ? z1Var.f184699g : null, null, null, 24, null);
            gVar.getClass();
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new h(eVar5, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new a(eVar5, null), 3);
            i0VarJ = ge1.b.j(b0Var, null, null, new C1491b(gVar, null), 3);
            this.f73658g = null;
            this.f73652a = eVar5;
            this.f73653b = j0VarJ;
            this.f73654c = i0VarJ;
            this.f73657f = 2;
            objC2 = j0VarJ2.C(this);
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            if (objC2 != aVar) {
                eVar = eVar5;
                list = (List) objC2;
                this.f73658g = null;
                this.f73652a = eVar;
                this.f73653b = null;
                this.f73654c = i0VarJ;
                this.f73655d = list;
                this.f73657f = 3;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar) {
                    i0Var = i0VarJ;
                    list2 = list;
                    list3 = (List) objAwait;
                    this.f73658g = null;
                    this.f73652a = eVar;
                    this.f73653b = null;
                    this.f73654c = null;
                    this.f73655d = list2;
                    this.f73656e = list3;
                    this.f73657f = 4;
                    objAwait2 = i0Var.await(this);
                    if (objAwait2 != aVar) {
                        list4 = list2;
                        list5 = list3;
                        eVar2 = eVar;
                        g2Var = (g2) objAwait2;
                        p2Var = gVar.f73644d;
                        do {
                            value2 = p2Var.getValue();
                            g3.a aVar4 = g3.f35298f;
                            fVar = eVar2.f133979b;
                            if (fVar != null) {
                                fVarA = ou0.f.a(fVar, null, null, g2Var, null, null, 59);
                            } else {
                                fVarA = null;
                            }
                            eVarA = ou0.e.a(eVar2, null, fVarA, list4, list5, 5);
                            aVar4.getClass();
                        } while (!p2Var.b(value2, g3.a.d(eVarA)));
                        return Unit.INSTANCE;
                    }
                }
            }
            return aVar;
        }
    }

    public g(long j8, uu0.h hVar) {
        hVar.getClass();
        this.f73641a = j8;
        this.f73642b = hVar;
        this.f73643c = (uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null);
        p2 p2VarA = q2.a(g3.a.c(g3.f35298f));
        this.f73644d = p2VarA;
        this.f73645e = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f73646f = p2VarA2;
        this.f73647g = r53.s.d(p2VarA2);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
    }
}
