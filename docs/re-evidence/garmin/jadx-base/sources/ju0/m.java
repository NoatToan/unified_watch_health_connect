package ju0;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lju0/q;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo$getLiveEventSharingSettings$settingsResult$1", f = "LiveEventSharingRepo.kt", l = {85}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super a0<q>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f100917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, String str, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f100916b = eVar;
        this.f100917c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f100916b, this.f100917c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<q>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100915a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<q>> i0VarC = this.f100916b.f100882a.c(this.f100917c);
        this.f100915a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
