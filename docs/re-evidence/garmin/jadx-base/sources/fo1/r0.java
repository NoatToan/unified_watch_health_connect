package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$addGroupComment$1", f = "ConversationViewModel.kt", l = {808}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.l<t13.d<? super v2<? extends ConversationCommentDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ConversationCommentDTO f72737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(o0 o0Var, String str, am.c2 c2Var, String str2, ConversationCommentDTO conversationCommentDTO, t13.d<? super r0> dVar) {
        super(1, dVar);
        this.f72733b = o0Var;
        this.f72734c = str;
        this.f72735d = c2Var;
        this.f72736e = str2;
        this.f72737f = conversationCommentDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r0(this.f72733b, this.f72734c, this.f72735d, this.f72736e, this.f72737f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends ConversationCommentDTO>> dVar) {
        return ((r0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72732a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        f fVar = this.f72733b.f72674v;
        this.f72732a = 1;
        fVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new y(fVar, this.f72734c, this.f72735d, this.f72736e, this.f72737f, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
