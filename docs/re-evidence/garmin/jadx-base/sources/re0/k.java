package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lue0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ChildAccountSharingRepository$getInvites$2", f = "ChildAccountSharingRepository.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super c83.a0<ue0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f152144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f152144b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f152144b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ue0.b>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152143a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        m mVar = this.f152144b;
        i0<c83.a0<ue0.b>> i0VarP = mVar.f152148a.p(mVar.f152149b);
        this.f152143a = 1;
        Object objAwait = i0VarP.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
