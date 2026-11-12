package q52;

import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lq52/a;", "status", "", "<anonymous>", "(Lr53/j;Lq52/a;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.domain.details.ObserveDeviceSyncStatusUseCase$invoke$3", f = "ObserveDeviceSyncStatusUseCase.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements q<j<? super a>, a, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f142942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j f142943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ a f142944c;

    public i(t13.d<? super i> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j<? super a> jVar, a aVar, t13.d<? super Boolean> dVar) {
        i iVar = new i(dVar);
        iVar.f142943b = jVar;
        iVar.f142944c = aVar;
        return iVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j jVar = this.f142943b;
        a aVar = this.f142944c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f142942a;
        if (i14 == 0) {
            r.b(obj);
            this.f142943b = null;
            this.f142944c = aVar;
            this.f142942a = 1;
            if (jVar.emit(aVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Boolean.valueOf((aVar == a.SUCCESS || aVar == a.FAILURE || aVar == a.START_TIMEOUT) ? false : true);
    }
}
