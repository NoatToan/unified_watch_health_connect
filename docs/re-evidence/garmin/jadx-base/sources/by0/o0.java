package by0;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lk61/b;", "<anonymous>", "(Lo53/b0;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getCyclingAbilityData$2$1", f = "MultiDayActivityDataStore.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
public final class o0 extends v13.i implements e23.p<o53.b0, t13.d<? super k61.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<o53.b0, t13.d<? super k61.b>, Object> f21981c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lk61/b;", "<anonymous>", "(Lo53/b0;)Lk61/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore$getCyclingAbilityData$2$1$result$1", f = "MultiDayActivityDataStore.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super k61.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.p<o53.b0, t13.d<? super k61.b>, Object> f21984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super o53.b0, ? super t13.d<? super k61.b>, ? extends Object> pVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21984c = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21984c, dVar);
            aVar.f21983b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super k61.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f21983b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21982a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f21983b = null;
            this.f21982a = 1;
            Object objInvoke = this.f21984c.invoke(b0Var, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(e23.p<? super o53.b0, ? super t13.d<? super k61.b>, ? extends Object> pVar, t13.d<? super o0> dVar) {
        super(2, dVar);
        this.f21981c = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o0 o0Var = new o0(this.f21981c, dVar);
        o0Var.f21980b = obj;
        return o0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super k61.b> dVar) {
        return ((o0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f21980b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f21979a;
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
        o53.j0 j0VarJ = ge1.b.j(b0Var, x53.b.f189152a, null, new a(this.f21981c, null), 2);
        this.f21980b = null;
        this.f21979a = 1;
        Object objC = j0VarJ.C(this);
        return objC == aVar ? aVar : objC;
    }
}
