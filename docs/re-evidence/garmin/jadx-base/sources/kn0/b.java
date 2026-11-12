package kn0;

import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lin0/d;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.healthstatus.data.repository.HealthStatusRepositoryImpl$getDetails$2", f = "HealthStatusRepositoryImpl.kt", l = {20}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super v2<? extends in0.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f105628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f105629c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lin0/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.healthstatus.data.repository.HealthStatusRepositoryImpl$getDetails$2$1", f = "HealthStatusRepositoryImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<in0.d>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f105630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f105631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f105632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, d dVar, t13.d<? super a> dVar2) {
            super(1, dVar2);
            this.f105631b = oVar;
            this.f105632c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f105631b, this.f105632c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<in0.d>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f105630a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            fz0.c cVarA = fz0.d.a(this.f105631b);
            hn0.a aVar2 = this.f105632c.f105641a;
            this.f105630a = 1;
            Object objB = aVar2.b(cVarA, this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, o oVar, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f105628b = dVar;
        this.f105629c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f105628b, this.f105629c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends in0.d>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105627a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        o oVar = this.f105629c;
        d dVar = this.f105628b;
        a aVar2 = new a(oVar, dVar, null);
        this.f105627a = 1;
        dVar.getClass();
        Object objJ = f0.J(dVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
