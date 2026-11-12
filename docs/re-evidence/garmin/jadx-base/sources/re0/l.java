package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lue0/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.ChildAccountSharingRepository$sendInvite$2", f = "ChildAccountSharingRepository.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<ue0.j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f152146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f152147c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, long j8, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f152146b = mVar;
        this.f152147c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f152146b, this.f152147c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ue0.j>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152145a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        m mVar = this.f152146b;
        i0<c83.a0<ue0.j>> i0VarH = mVar.f152148a.h(mVar.f152149b, new ue0.o(this.f152147c, null, 2, null));
        this.f152145a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
