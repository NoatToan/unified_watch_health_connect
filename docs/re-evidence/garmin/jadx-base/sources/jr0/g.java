package jr0;

import c83.a0;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lb22/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.intensityminutes.data.repository.IntensityMinutesRepositoryImpl$getIntensityMinutesDailySummaries$2", f = "IntensityMinutesRepositoryImpl.kt", l = {119}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.l<t13.d<? super a0<b22.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f100524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f100525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f100526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, DateTime dateTime, DateTime dateTime2, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f100524b = bVar;
        this.f100525c = dateTime;
        this.f100526d = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f100524b, this.f100525c, this.f100526d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<b22.f>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100523a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        hr0.a aVar2 = this.f100524b.f100509a;
        String string = this.f100525c.toLocalDate().toString();
        string.getClass();
        String string2 = this.f100526d.toLocalDate().toString();
        string2.getClass();
        i0<a0<b22.f>> i0VarE = aVar2.e(string, string2);
        this.f100523a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
