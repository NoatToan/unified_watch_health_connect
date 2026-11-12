package ju0;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lju0/q;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo$getLesCachedSettings$settingsResult$1", f = "LiveEventSharingRepo.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.l<t13.d<? super a0<q>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f100907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, long j8, t13.d<? super j> dVar) {
        super(1, dVar);
        this.f100906b = eVar;
        this.f100907c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new j(this.f100906b, this.f100907c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<q>> dVar) {
        return ((j) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100905a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<q>> i0VarC = this.f100906b.f100882a.c(String.valueOf(this.f100907c));
        this.f100905a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
