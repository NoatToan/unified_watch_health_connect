package i62;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.workouts.data.model.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutListViewModel$fetchMSNWorkouts$1", f = "MSNWorkoutListViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f91855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<s>> f91856c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutListViewModel$fetchMSNWorkouts$1$1", f = "MSNWorkoutListViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f91857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f91858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<s>> f91859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, y0<fw.m<s>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f91858b = lVar;
            this.f91859c = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f91858b, this.f91859c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f91857a;
            if (i14 == 0) {
                r.b(obj);
                this.f91857a = 1;
                if (l.x4(this.f91858b, this.f91859c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, y0<fw.m<s>> y0Var, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f91855b = lVar;
        this.f91856c = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f91855b, this.f91856c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f91854a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f91855b, this.f91856c, null);
            this.f91854a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
