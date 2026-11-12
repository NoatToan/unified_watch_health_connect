package re0;

import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lue0/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.api.AccountSharingRepository$authorizeViewer$2", f = "AccountSharingRepository.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super c83.a0<ue0.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f152102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue0.e f152103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ue0.e eVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f152102b = gVar;
        this.f152103c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f152102b, this.f152103c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ue0.f>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152101a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = this.f152102b.f152127a;
        ue0.e eVar = this.f152103c;
        i0<c83.a0<ue0.f>> i0VarE = aVar2.e(eVar.getResponseType(), eVar.getSubjectUserId(), eVar.getClientId(), eVar.getCodeChallenge(), eVar.getCodeChallengeMethod(), eVar.getCh.qos.logback.core.joran.action.Action.SCOPE_ATTRIBUTE java.lang.String());
        this.f152101a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
