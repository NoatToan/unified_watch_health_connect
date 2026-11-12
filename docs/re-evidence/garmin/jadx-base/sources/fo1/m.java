package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$getComments$2", f = "ConversationRepo.kt", l = {175}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ConversationCommentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f72629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, am.c2 c2Var, String str, int i14, int i15, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f72626b = fVar;
        this.f72627c = c2Var;
        this.f72628d = str;
        this.f72629e = i14;
        this.f72630f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f72626b, this.f72627c, this.f72628d, this.f72629e, this.f72630f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ConversationCommentDTO>>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72625a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<ConversationCommentDTO>>> i0VarR = this.f72626b.f72523a.r(this.f72627c.name(), this.f72628d, this.f72629e, this.f72630f);
        this.f72625a = 1;
        Object objAwait = i0VarR.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
