package zc1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzc1/c;", "Lzc1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lyc1/a;", "racePredictorAPI", "<init>", "(Lyc1/a;)V", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements zc1.a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yc1.a f203952a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lr61/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.racepredictor.data.repo.RacePredictorRepositoryImpl$getDailyRacePredictorStats$2", f = "RacePredictorRepositoryImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<List<? extends r61.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f203953a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f203955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fz0.c f203956d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ fz0.c f203957e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, fz0.c cVar, fz0.c cVar2, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f203955c = str;
            this.f203956d = cVar;
            this.f203957e = cVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return c.this.new a(this.f203955c, this.f203956d, this.f203957e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<List<? extends r61.a>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f203953a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            yc1.a aVar2 = c.this.f203952a;
            this.f203953a = 1;
            Object objA = aVar2.a(this.f203955c, this.f203956d, this.f203957e, this);
            return objA == aVar ? aVar : objA;
        }
    }

    public c(yc1.a aVar) {
        aVar.getClass();
        this.f203952a = aVar;
    }

    @Override // zc1.a
    public final Object a(String str, fz0.c cVar, fz0.c cVar2, t13.d<? super v2<? extends List<r61.a>>> dVar) {
        return f0.J(this, new a(str, cVar, cVar2, null), dVar);
    }

    @Override // zc1.a
    public final Object b(String str, fz0.c cVar, fz0.c cVar2, gd1.a.c cVar3) {
        return f0.J(this, new d(this, str, cVar, cVar2, null), cVar3);
    }

    @Override // zc1.a
    public final Object c(String str, gd1.a.C1551a c1551a) {
        return f0.J(this, new b(this, str, null), c1551a);
    }
}
