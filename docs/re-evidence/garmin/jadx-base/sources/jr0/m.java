package jr0;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lir0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl$getIntensityMinutesWeeklySummary$result$1", f = "IntensityMinutesRepositoryImpl.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super a0<List<? extends ir0.f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f100546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f100547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b bVar, DateTime dateTime, DateTime dateTime2, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f100545b = bVar;
        this.f100546c = dateTime;
        this.f100547d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f100545b, this.f100546c, this.f100547d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends ir0.f>>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100544a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<ir0.f>>> i0VarB = this.f100545b.f100509a.b(fz0.d.b(this.f100546c), fz0.d.b(this.f100547d));
        this.f100544a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
