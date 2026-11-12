package hg0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.network.eventsearch.activity.ActivityRepo$addEventToActivity$2", f = "ActivityRepo.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f83655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f83656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps.d f83657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j8, ps.d dVar, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f83655b = bVar;
        this.f83656c = j8;
        this.f83657d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f83655b, this.f83656c, this.f83657d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<String>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83654a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<String>> i0VarD = this.f83655b.f83653a.d(this.f83656c, this.f83657d);
        this.f83654a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
