package fo1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/f;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepoViewModelDelegateImp$likeConversation$1", f = "ConversationRepoViewModelDelegateImp.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.l<t13.d<? super v2<? extends mo1.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f72562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, am.c2 c2Var, String str, t13.d<? super h0> dVar) {
        super(1, dVar);
        this.f72562b = l0Var;
        this.f72563c = c2Var;
        this.f72564d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h0(this.f72562b, this.f72563c, this.f72564d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends mo1.f>> dVar) {
        return ((h0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72561a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        f fVar = this.f72562b.f72618a;
        this.f72561a = 1;
        fVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new v(fVar, this.f72563c, this.f72564d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
