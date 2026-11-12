package jr0;

import c83.a0;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lir0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl$getIntensityMinutesHourlySummary$result$1", f = "IntensityMinutesRepositoryImpl.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super a0<ir0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f100539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f100540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, DateTime dateTime, int i14, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f100538b = bVar;
        this.f100539c = dateTime;
        this.f100540d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f100538b, this.f100539c, this.f100540d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ir0.c>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100537a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ir0.c>> i0VarC = this.f100538b.f100509a.c(fz0.d.b(this.f100539c), this.f100540d);
        this.f100537a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
