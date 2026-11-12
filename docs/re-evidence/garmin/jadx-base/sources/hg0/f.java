package hg0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.b2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/b2;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.activity.ActivityRepo$getWeatherDataForActivity$2", f = "ActivityRepo.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<b2>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f83672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, long j8, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f83671b = bVar;
        this.f83672c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f83671b, this.f83672c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<b2>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83670a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<b2>> i0VarA = this.f83671b.f83653a.a(this.f83672c);
        this.f83670a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
