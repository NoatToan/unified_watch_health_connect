package fo1;

import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lam/c2;", "resourceType", "", "resourceId", "", TtmlNode.START, "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lcom/garmin/android/apps/connectmobile/social/conversationservice/model/ConversationCommentDTO;", "<anonymous>", "(Lam/c2;Ljava/lang/String;I)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$fetchGroupComments$1", f = "ConversationViewModel.kt", l = {1059, 1060}, m = "invokeSuspend", v = 2)
public final class h1 extends v13.i implements e23.r<am.c2, String, Integer, t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f72565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ am.c2 f72567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f72568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f72569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f72570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f72571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(o0 o0Var, String str, t13.d<? super h1> dVar) {
        super(4, dVar);
        this.f72570f = o0Var;
        this.f72571g = str;
    }

    @Override // e23.r
    public final Object invoke(am.c2 c2Var, String str, Integer num, t13.d<? super v2<? extends List<? extends ConversationCommentDTO>>> dVar) {
        int iIntValue = num.intValue();
        h1 h1Var = new h1(this.f72570f, this.f72571g, dVar);
        h1Var.f72567c = c2Var;
        h1Var.f72568d = str;
        h1Var.f72569e = iIntValue;
        return h1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        am.c2 c2Var = this.f72567c;
        String str = this.f72568d;
        int i14 = this.f72569e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f72566b;
        o0 o0Var = this.f72570f;
        if (i15 == 0) {
            o13.r.b(obj);
            f fVar = o0Var.f72674v;
            this.f72567c = null;
            this.f72568d = null;
            this.f72569e = i14;
            this.f72566b = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new p(fVar, this.f72571g, c2Var, str, i14, 11, null), this);
            if (obj != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2 v2Var = this.f72565a;
            o13.r.b(obj);
            return v2Var;
        }
        o13.r.b(obj);
        v2 v2Var2 = (v2) obj;
        this.f72567c = null;
        this.f72568d = null;
        this.f72565a = v2Var2;
        this.f72569e = i14;
        this.f72566b = 2;
        return o0.x4(o0Var, v2Var2, this) == aVar ? aVar : v2Var2;
    }
}
