package fo1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lmo1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.VivoKidChallengeRepo$getVivoKidAdhocCommentLikes$2", f = "VivoKidChallengeRepo.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class u1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends mo1.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f72804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(x1 x1Var, String str, t13.d<? super u1> dVar) {
        super(1, dVar);
        this.f72804b = x1Var;
        this.f72805c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u1(this.f72804b, this.f72805c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends mo1.h>>> dVar) {
        return ((u1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72803a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<mo1.h>>> i0VarC = this.f72804b.f72860a.c(this.f72805c);
        this.f72803a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
