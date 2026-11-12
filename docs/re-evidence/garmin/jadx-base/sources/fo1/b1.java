package fo1;

import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import org.json.JSONException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$fetchActivitySummaryDTOAndUpdateLiveData$1", f = "ConversationViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f72474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<g3<com.garmin.android.apps.connectmobile.activities.newmodel.h>> f72475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(o0 o0Var, long j8, androidx.lifecycle.y0<g3<com.garmin.android.apps.connectmobile.activities.newmodel.h>> y0Var, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f72473b = o0Var;
        this.f72474c = j8;
        this.f72475d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f72473b, this.f72474c, this.f72475d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72472a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f72472a = 1;
            int i15 = o0.H0;
            obj = this.f72473b.D4(this.f72474c, this);
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
        boolean z14 = v2Var instanceof v2.a;
        androidx.lifecycle.y0<g3<com.garmin.android.apps.connectmobile.activities.newmodel.h>> y0Var = this.f72475d;
        if (z14) {
            y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
        } else {
            if (!(v2Var instanceof v2.b)) {
                lc.u0.r();
                return null;
            }
            u62.z.h(g3.f35298f, ((v2.b) v2Var).f47386a, y0Var);
        }
        return Unit.INSTANCE;
    }
}
