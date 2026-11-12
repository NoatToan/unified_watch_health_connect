package xr;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import r53.s;
import u1.d2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.ActivityDetailsOverviewScreenKt$ActivityDetailsOverviewScreen$2$1", f = "ActivityDetailsOverviewScreen.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f191960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f191961c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f191962a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar) {
            this.f191962a = lVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f191962a.invoke(bool);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f191963a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f191964a;

            /* JADX INFO: renamed from: xr.e$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.overview.ActivityDetailsOverviewScreenKt$ActivityDetailsOverviewScreen$2$1$invokeSuspend$$inlined$map$1$2", f = "ActivityDetailsOverviewScreen.kt", l = {50}, m = "emit", v = 2)
            public static final class C3576a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f191965a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f191966b;

                public C3576a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f191965a = obj;
                    this.f191966b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar) {
                this.f191964a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3576a c3576a;
                if (dVar instanceof C3576a) {
                    c3576a = (C3576a) dVar;
                    int i14 = c3576a.f191966b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3576a.f191966b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3576a = new C3576a(dVar);
                    }
                } else {
                    c3576a = new C3576a(dVar);
                }
                Object obj2 = c3576a.f191965a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3576a.f191966b;
                if (i15 == 0) {
                    o13.r.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() != 0);
                    c3576a.f191966b = 1;
                    if (this.f191964a.emit(boolValueOf, c3576a) == aVar) {
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

        public b(r53.i iVar) {
            this.f191963a = iVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Boolean> jVar, t13.d dVar) {
            Object objCollect = this.f191963a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(d2 d2Var, e23.l<? super Boolean, Unit> lVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f191960b = d2Var;
        this.f191961c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f191960b, this.f191961c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191959a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.i iVarS = s.s(new b(p0.s(new ok0.f(this.f191960b, 4))));
            a aVar2 = new a(this.f191961c);
            this.f191959a = 1;
            if (iVarS.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
