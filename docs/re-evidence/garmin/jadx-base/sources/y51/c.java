package y51;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lz51/g;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.PendingActivitiesRepositoryImpl$getPendingActivities$2", f = "PendingActivitiesRepositoryImpl.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super v2<? extends z51.g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f194499b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lz51/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.PendingActivitiesRepositoryImpl$getPendingActivities$2$1", f = "PendingActivitiesRepositoryImpl.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<z51.g>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f194500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f194501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f194501b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f194501b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<z51.g>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f194500a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<z51.g>> i0VarB = this.f194501b.f194520a.b();
            this.f194500a = 1;
            Object objAwait = i0VarB.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f194499b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f194499b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends z51.g>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194498a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        f fVar = this.f194499b;
        a aVar2 = new a(fVar, null);
        this.f194498a = 1;
        fVar.getClass();
        Object objJ = f0.J(fVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
