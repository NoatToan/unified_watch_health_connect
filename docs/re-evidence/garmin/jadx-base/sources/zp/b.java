package zp;

import am.b2;
import am.x0;
import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.r;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzp/b;", "Lzp/a;", "Lam/b2;", "activityAPI", "<init>", "(Lam/b2;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements zp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f206536a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.repository.ActivitiesRepositoryImpl$getActivitySummaryLiveData$2", f = "ActivitiesRepositoryImpl.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<r>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f206537a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f206539c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f206539c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return b.this.new a(this.f206539c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<r>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f206537a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            i0<a0<r>> i0VarC = b.this.f206536a.c(this.f206539c);
            this.f206537a = 1;
            Object objAwait = i0VarC.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public b(b2 b2Var) {
        b2Var.getClass();
        this.f206536a = b2Var;
    }

    @Override // zp.a
    public final Object H3(Long l14, o oVar, o oVar2, int i14, fl1.d dVar) {
        return f0.J(this, new d(this, l14, oVar, oVar2, i14, null), dVar);
    }

    @Override // zp.a
    public final Object K3(long j8, t13.d<? super v2<r>> dVar) {
        return f0.J(this, new a(j8, null), dVar);
    }

    @Override // zp.a
    public final Object P3(o oVar, o oVar2, x0 x0Var, r91.e eVar) {
        return f0.J(this, new c(this, oVar, oVar2, x0Var, 10, null), eVar);
    }
}
