package fo1;

import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$confirmDeleteComment$1", f = "ConversationViewModel.kt", l = {380}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f72837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f72838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f72839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f72841f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(o0 o0Var, String str, String str2, String str3, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f72838c = o0Var;
        this.f72839d = str;
        this.f72840e = str2;
        this.f72841f = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w0 w0Var = new w0(this.f72838c, this.f72839d, this.f72840e, this.f72841f, dVar);
        w0Var.f72837b = obj;
        return w0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f72837b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72836a;
        String str = this.f72840e;
        o0 o0Var = this.f72838c;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = o0Var.f72674v;
            this.f72837b = b0Var;
            this.f72836a = 1;
            fVar.getClass();
            obj = com.garmin.android.apps.connectmobile.f0.J(fVar, new i(fVar, this.f72839d, str, this.f72841f, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.a) {
            String strM = am.j.m("confirmDeleteComment: Failed to delete comment=[", str, "]");
            i2.a aVar2 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var, "ConversationViewModel", strM);
            o0Var.f72666l.j(lj0.b.f112956j);
        } else {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            o0Var.J4(str);
            o0Var.A = true;
            int i15 = o0Var.B;
            o0Var.B = i15 - 1;
            o72.t.k(i15);
        }
        return Unit.INSTANCE;
    }
}
