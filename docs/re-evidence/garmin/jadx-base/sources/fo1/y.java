package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$postGroupComment$2", f = "ConversationRepo.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.l<t13.d<? super c83.a0<ConversationCommentDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f72866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f fVar, String str, am.c2 c2Var, String str2, ConversationCommentDTO conversationCommentDTO, t13.d<? super y> dVar) {
        super(1, dVar);
        this.f72862b = fVar;
        this.f72863c = str;
        this.f72864d = c2Var;
        this.f72865e = str2;
        this.f72866f = conversationCommentDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y(this.f72862b, this.f72863c, this.f72864d, this.f72865e, this.f72866f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ConversationCommentDTO>> dVar) {
        return ((y) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72861a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ConversationCommentDTO>> i0VarW = this.f72862b.f72523a.w(this.f72863c, this.f72864d.name(), this.f72865e, this.f72866f);
        this.f72861a = 1;
        Object objAwait = i0VarW.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
