package by0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmm1/b;", "<anonymous>", "(Lo53/b0;)Lmm1/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getSleepDailySummary$2$1", f = "MultiDayActivityDataStore.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.p<o53.b0, t13.d<? super mm1.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<? super mm1.b>, Object> f21916c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmm1/b;", "<anonymous>", "(Lo53/b0;)Lmm1/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getSleepDailySummary$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {153}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super mm1.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<? super mm1.b>, Object> f21919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super o53.b0, ? super t13.d<? super mm1.b>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21919c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21919c, dVar);
            aVar.f21918b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super mm1.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f21918b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21917a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f21918b = null;
            this.f21917a = 1;
            Object objInvoke = this.f21919c.invoke(b0Var, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k1(e23.p<? super o53.b0, ? super t13.d<? super mm1.b>, ? extends Object> pVar, t13.d<? super k1> dVar) {
        super(2, dVar);
        this.f21916c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k1 k1Var = new k1(this.f21916c, dVar);
        k1Var.f21915b = obj;
        return k1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super mm1.b> dVar) {
        return ((k1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f21915b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21914a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        x53.c cVar = o53.s0.f129406a;
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f21916c, null), 2);
        this.f21915b = null;
        this.f21914a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}
