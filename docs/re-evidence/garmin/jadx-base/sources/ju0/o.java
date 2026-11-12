package ju0;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lju0/q;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo$saveLiveEventSharingSettings$settingsResult$1", f = "LiveEventSharingRepo.kt", l = {114}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<q>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f100922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f100923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f100924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f100925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e eVar, String str, q qVar, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f100923b = eVar;
        this.f100924c = str;
        this.f100925d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f100923b, this.f100924c, this.f100925d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<q>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100922a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<q>> i0VarA = this.f100923b.f100882a.a(this.f100924c, this.f100925d);
        this.f100922a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
