package fo1;

import android.content.Context;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$fetchGroupActivityPostFeed$1", f = "ConversationViewModel.kt", l = {177}, m = "invokeSuspend", v = 2)
public final class f1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<g3<wg0.a>> f72534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f72535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f72536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f72537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ am.c2 f72538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.lifecycle.y0<g3<wg0.a>> y0Var, o0 o0Var, Context context, String str, am.c2 c2Var, t13.d<? super f1> dVar) {
        super(2, dVar);
        this.f72534b = y0Var;
        this.f72535c = o0Var;
        this.f72536d = context;
        this.f72537e = str;
        this.f72538f = c2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f1(this.f72534b, this.f72535c, this.f72536d, this.f72537e, this.f72538f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72533a;
        o0 o0Var = this.f72535c;
        androidx.lifecycle.y0<g3<wg0.a>> y0Var = this.f72534b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            this.f72533a = 1;
            int i15 = o0.H0;
            obj = o0Var.F4(this.f72536d, this.f72537e, this.f72538f, this);
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
            y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
        } else {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            T t7 = ((v2.b) v2Var).f47386a;
            o0Var.f72659f = (Parcelable) t7;
            u62.z.h(g3.f35298f, t7, y0Var);
        }
        return Unit.INSTANCE;
    }
}
