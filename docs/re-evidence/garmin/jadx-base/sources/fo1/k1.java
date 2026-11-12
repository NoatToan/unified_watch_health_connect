package fo1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/f;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$likeGroupFeed$1", f = "ConversationViewModel.kt", l = {682}, m = "invokeSuspend", v = 2)
public final class k1 extends v13.i implements e23.l<t13.d<? super v2<? extends mo1.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(o0 o0Var, String str, am.c2 c2Var, String str2, t13.d<? super k1> dVar) {
        super(1, dVar);
        this.f72609b = o0Var;
        this.f72610c = str;
        this.f72611d = c2Var;
        this.f72612e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k1(this.f72609b, this.f72610c, this.f72611d, this.f72612e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends mo1.f>> dVar) {
        return ((k1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72608a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o0 o0Var = this.f72609b;
        o0Var.C = true;
        f fVar = o0Var.f72674v;
        this.f72608a = 1;
        fVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(fVar, new w(fVar, this.f72610c, this.f72611d, this.f72612e, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
