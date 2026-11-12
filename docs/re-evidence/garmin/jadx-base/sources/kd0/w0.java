package kd0;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/w0;", "Lhe0/a;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;", "dashboardConfigDataSource", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/l0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w0 implements he0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 f104400a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f104401a;

        /* JADX INFO: renamed from: kd0.w0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1994a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f104402a;

            /* JADX INFO: renamed from: kd0.w0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DashboardConfigDelegateImpl$observeEssentialsEnabled$$inlined$map$1$2", f = "DashboardConfigDelegateImpl.kt", l = {50}, m = "emit", v = 2)
            public static final class C1995a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f104403a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f104404b;

                public C1995a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f104403a = obj;
                    this.f104404b |= Integer.MIN_VALUE;
                    return C1994a.this.emit(null, this);
                }
            }

            public C1994a(r53.j jVar) {
                this.f104402a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C1995a c1995a;
                if (dVar instanceof C1995a) {
                    c1995a = (C1995a) dVar;
                    int i14 = c1995a.f104404b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1995a.f104404b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1995a = new C1995a(dVar);
                    }
                } else {
                    c1995a = new C1995a(dVar);
                }
                Object obj2 = c1995a.f104403a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1995a.f104404b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    List<j70.v> listD = ((j70.f) obj).d();
                    boolean z14 = false;
                    if (listD != null && !listD.isEmpty()) {
                        Iterator<T> it = listD.iterator();
                        while (it.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(((j70.v) it.next()).getSectionType(), o70.f.ESSENTIALS_STATS.f129989a)) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                    Boolean boolValueOf = Boolean.valueOf(z14);
                    c1995a.f104404b = 1;
                    if (this.f104402a.emit(boolValueOf, c1995a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(r53.i iVar) {
            this.f104401a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f104401a.collect(new C1994a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public w0(com.garmin.android.apps.connectmobile.dashboard.data.datasource.l0 l0Var) {
        l0Var.getClass();
        this.f104400a = l0Var;
    }

    @Override // he0.a
    public final r53.i<Boolean> a() {
        return r53.s.s(new a(this.f104400a.p()));
    }
}
