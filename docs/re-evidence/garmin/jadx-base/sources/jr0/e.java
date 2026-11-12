package jr0;

import c83.a0;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lir0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl$getDailyIntensityMinutes$result$1", f = "IntensityMinutesRepositoryImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.l<t13.d<? super a0<ir0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f100519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, DateTime dateTime, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f100518b = bVar;
        this.f100519c = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f100518b, this.f100519c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ir0.a>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100517a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ir0.a>> i0VarD = this.f100518b.f100509a.d(fz0.d.b(this.f100519c));
        this.f100517a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
