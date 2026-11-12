package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.VivoKidChallengeConversationCommentDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/VivoKidChallengeConversationCommentDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.VivoKidChallengeRepo$getVivoKidAdhocComments$2", f = "VivoKidChallengeRepo.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class v1 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends VivoKidChallengeConversationCommentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f72826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f72829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f72830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, String str, String str2, int i14, int i15, t13.d<? super v1> dVar) {
        super(1, dVar);
        this.f72826b = x1Var;
        this.f72827c = str;
        this.f72828d = str2;
        this.f72829e = i14;
        this.f72830f = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v1(this.f72826b, this.f72827c, this.f72828d, this.f72829e, this.f72830f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends VivoKidChallengeConversationCommentDTO>>> dVar) {
        return ((v1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72825a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<VivoKidChallengeConversationCommentDTO>>> i0VarD = this.f72826b.f72860a.d(this.f72827c, this.f72828d, this.f72829e, this.f72830f);
        this.f72825a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
