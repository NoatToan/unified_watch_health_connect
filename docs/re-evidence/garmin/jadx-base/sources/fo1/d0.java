package fo1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepoViewModelDelegateImp$deleteComment$1", f = "ConversationRepoViewModelDelegateImp.kt", l = {66}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f72498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l0 l0Var, String str, String str2, String str3, t13.d<? super d0> dVar) {
        super(1, dVar);
        this.f72498b = l0Var;
        this.f72499c = str;
        this.f72500d = str2;
        this.f72501e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d0(this.f72498b, this.f72499c, this.f72500d, this.f72501e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72497a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        f fVar = this.f72498b.f72618a;
        this.f72497a = 1;
        fVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new i(fVar, this.f72499c, this.f72500d, this.f72501e, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
