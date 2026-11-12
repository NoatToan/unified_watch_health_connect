package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationRepo$getGroupComments$2", f = "ConversationRepo.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ConversationCommentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f72706g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f fVar, String str, am.c2 c2Var, String str2, int i14, int i15, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f72701b = fVar;
        this.f72702c = str;
        this.f72703d = c2Var;
        this.f72704e = str2;
        this.f72705f = i14;
        this.f72706g = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f72701b, this.f72702c, this.f72703d, this.f72704e, this.f72705f, this.f72706g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ConversationCommentDTO>>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72700a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<ConversationCommentDTO>>> i0VarI = this.f72701b.f72523a.i(this.f72702c, this.f72703d.name(), this.f72704e, this.f72705f, this.f72706g);
        this.f72700a = 1;
        Object objAwait = i0VarI.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
