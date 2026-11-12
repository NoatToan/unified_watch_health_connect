package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$postCommentOnResource$2", f = "ConversationRepo.kt", l = {195}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<ConversationCommentDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f72850e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, am.c2 c2Var, String str, ConversationCommentDTO conversationCommentDTO, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f72847b = fVar;
        this.f72848c = c2Var;
        this.f72849d = str;
        this.f72850e = conversationCommentDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f72847b, this.f72848c, this.f72849d, this.f72850e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ConversationCommentDTO>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72846a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ConversationCommentDTO>> i0VarZ = this.f72847b.f72523a.z(this.f72848c.name(), this.f72849d, this.f72850e);
        this.f72846a = 1;
        Object objAwait = i0VarZ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
