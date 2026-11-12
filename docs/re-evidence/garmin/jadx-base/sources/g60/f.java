package g60;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lg60/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.DefaultCriticalSwimSpeedRepository$getLatestCriticalSwimSpeed$result$1", f = "CriticalSwimSpeedRepository.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f76043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f76044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f76045c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, DateTime dateTime, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f76044b = hVar;
        this.f76045c = dateTime;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f76044b, this.f76045c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<b>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f76043a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<b>> i0VarA = this.f76044b.f76049a.a(fz0.d.b(this.f76045c));
        this.f76043a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
