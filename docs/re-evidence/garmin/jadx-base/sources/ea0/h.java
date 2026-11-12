package ea0;

import com.garmin.proto.generated.GDIConnectionManagement;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.j;
import r53.s;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.connectiontype.BleConnectionTypeViewModel$confirmConnectionTypeSelection$1", f = "BleConnectionTypeViewModel.kt", l = {58, 61, 68}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f63624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gv.a f63625c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Le90/a$a;", "<anonymous>", "(Lo53/b0;)Le90/a$a;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.connectiontype.BleConnectionTypeViewModel$confirmConnectionTypeSelection$1$1", f = "BleConnectionTypeViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super e90.a.C1339a>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f63626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f63627b;

        /* JADX INFO: renamed from: ea0.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1341a implements r53.i<Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f63628a;

            /* JADX INFO: renamed from: ea0.h$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C1342a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f63629a;

                /* JADX INFO: renamed from: ea0.h$a$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.connectiontype.BleConnectionTypeViewModel$confirmConnectionTypeSelection$1$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "BleConnectionTypeViewModel.kt", l = {50}, m = "emit", v = 2)
                public static final class C1343a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f63630a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f63631b;

                    public C1343a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f63630a = obj;
                        this.f63631b |= Integer.MIN_VALUE;
                        return C1342a.this.emit(null, this);
                    }
                }

                public C1342a(j jVar) {
                    this.f63629a = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1343a c1343a;
                    if (dVar instanceof C1343a) {
                        c1343a = (C1343a) dVar;
                        int i14 = c1343a.f63631b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1343a.f63631b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1343a = new C1343a(dVar);
                        }
                    } else {
                        c1343a = new C1343a(dVar);
                    }
                    Object obj2 = c1343a.f63630a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1343a.f63631b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (obj instanceof e90.a.C1339a) {
                            c1343a.f63631b = 1;
                            if (this.f63629a.emit(obj, c1343a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C1341a(r53.i iVar) {
                this.f63628a = iVar;
            }

            @Override // r53.i
            public final Object collect(j<? super Object> jVar, t13.d dVar) {
                Object objCollect = this.f63628a.collect(new C1342a(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f63627b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f63627b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super e90.a.C1339a> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f63626a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            this.f63627b.f63616b.getClass();
            C1341a c1341a = new C1341a(s.f(new e90.b(null)));
            this.f63626a = 1;
            Object objX = s.x(c1341a, this);
            return objX == aVar ? aVar : objX;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, gv.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f63624b = gVar;
        this.f63625c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f63624b, this.f63625c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r11.emit(r2, r10) == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GDIConnectionManagement.SupportedConnectionTypes supportedConnectionTypes;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f63623a;
        gv.a aVar2 = this.f63625c;
        g gVar = this.f63624b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
                gVar.f63619e.k(null, Boolean.FALSE);
                e2 e2Var = gVar.f63621g;
                this.f63623a = 3;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        fv.a aVar3 = (fv.a) k.b(fv.a.class, gVar.f63615a);
        if (aVar3 != null) {
            aVar2.getClass();
            int i15 = gv.b.f79151a[aVar2.ordinal()];
            if (i15 == 1) {
                supportedConnectionTypes = GDIConnectionManagement.SupportedConnectionTypes.SECURE;
            } else if (i15 == 2) {
                supportedConnectionTypes = GDIConnectionManagement.SupportedConnectionTypes.OPEN;
            } else {
                if (i15 != 3) {
                    u0.r();
                    return null;
                }
                supportedConnectionTypes = GDIConnectionManagement.SupportedConnectionTypes.OFF;
            }
            this.f63623a = 1;
            if (aVar3.c(supportedConnectionTypes, this) != aVar) {
            }
        }
        return aVar;
        a aVar4 = new a(gVar, null);
        this.f63623a = 2;
        if (j2.c(5000L, aVar4, this) != aVar) {
            gVar.f63619e.k(null, Boolean.FALSE);
            e2 e2Var2 = gVar.f63621g;
            this.f63623a = 3;
        }
        return aVar;
    }
}
