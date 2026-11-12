package dp0;

import d81.t;
import j70.b0;
import o13.r;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.i;
import r53.j;
import t13.d;
import v13.c;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldp0/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f60636a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Module f60637b = ModuleDSLKt.module$default(false, new t(23), 1, null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i<j70.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f60638a;

        /* JADX INFO: renamed from: dp0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1285a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f60639a;

            /* JADX INFO: renamed from: dp0.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @e(c = "com.garmin.android.apps.connectmobile.home.yesterday.di.YesterdayStatsDI$module$lambda$0$1$$inlined$map$1$2", f = "YesterdayStatsDI.kt", l = {50}, m = "emit", v = 2)
            public static final class C1286a extends c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f60640a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f60641b;

                public C1286a(d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f60640a = obj;
                    this.f60641b |= Integer.MIN_VALUE;
                    return C1285a.this.emit(null, this);
                }
            }

            public C1285a(j jVar) {
                this.f60639a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            public final Object emit(Object obj, d dVar) {
                C1286a c1286a;
                if (dVar instanceof C1286a) {
                    c1286a = (C1286a) dVar;
                    int i14 = c1286a.f60641b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1286a.f60641b = i14 - Integer.MIN_VALUE;
                    } else {
                        c1286a = new C1286a(dVar);
                    }
                } else {
                    c1286a = new C1286a(dVar);
                }
                Object obj2 = c1286a.f60640a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c1286a.f60641b;
                if (i15 == 0) {
                    r.b(obj2);
                    b0 b0Var = (b0) ((j70.d) obj).f97521b;
                    j70.a aVar2 = b0Var != null ? b0Var.f97506d : null;
                    c1286a.f60641b = 1;
                    if (this.f60639a.emit(aVar2, c1286a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(i iVar) {
            this.f60638a = iVar;
        }

        @Override // r53.i
        public final Object collect(j<? super j70.a> jVar, d dVar) {
            Object objCollect = this.f60638a.collect(new C1285a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    private b() {
    }
}
