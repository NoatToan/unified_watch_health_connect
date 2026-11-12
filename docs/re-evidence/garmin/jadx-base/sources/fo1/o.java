package fo1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lmo1/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$getGroupActivityFeedLikeV2$2", f = "ConversationRepo.kt", l = {165}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends mo1.f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f72653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f fVar, String str, am.c2 c2Var, String str2, int i14, int i15, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f72648b = fVar;
        this.f72649c = str;
        this.f72650d = c2Var;
        this.f72651e = str2;
        this.f72652f = i14;
        this.f72653g = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f72648b, this.f72649c, this.f72650d, this.f72651e, this.f72652f, this.f72653g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends mo1.f>>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72647a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<mo1.f>>> i0VarU = this.f72648b.f72523a.u(this.f72649c, this.f72650d.name(), this.f72651e, this.f72652f, this.f72653g);
        this.f72647a = 1;
        Object objAwait = i0VarU.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
