package fo1;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$unlikeConversation$1", f = "ConversationViewModel.kt", l = {696}, m = "invokeSuspend", v = 2)
public final class q1 extends v13.i implements e23.l<t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f72723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f72724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f72725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(String str, Long l14, o0 o0Var, t13.d<? super q1> dVar) {
        super(1, dVar);
        this.f72723b = str;
        this.f72724c = l14;
        this.f72725d = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q1(this.f72723b, this.f72724c, this.f72725d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends Unit>> dVar) {
        return ((q1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72722a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        Long l14 = this.f72724c;
        String str = this.f72723b;
        if (str != null && l14 != null) {
            o0 o0Var = this.f72725d;
            o0Var.C = true;
            f fVar = o0Var.f72674v;
            String strValueOf = String.valueOf(l14.longValue());
            this.f72722a = 1;
            fVar.getClass();
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new b0(fVar, str, strValueOf, null), this);
            return objJ == aVar ? aVar : objJ;
        }
        String str2 = "unlikeActivity: invalid param conversationUuid=[" + str + "], conversationLikePk=[" + l14 + "]";
        i2.a aVar2 = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        i2.a.p(a2Var, "ConversationViewModel", str2);
        return new v2.a(new Exception("Invalid param found"), null, null, 6, null);
    }
}
