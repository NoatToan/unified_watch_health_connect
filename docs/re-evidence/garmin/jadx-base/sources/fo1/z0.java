package fo1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.feed.activity.exception.UnavailableReasonUnknownException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.ConversationViewModel$fetchActivityPost$1", f = "ConversationViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
public final class z0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f72883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<g3<wg0.a>> f72884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f72885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(o0 o0Var, androidx.lifecycle.y0<g3<wg0.a>> y0Var, Context context, t13.d<? super z0> dVar) {
        super(2, dVar);
        this.f72883b = o0Var;
        this.f72884c = y0Var;
        this.f72885d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z0(this.f72883b, this.f72884c, this.f72885d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72882a;
        androidx.lifecycle.y0<g3<wg0.a>> y0Var = this.f72884c;
        if (i14 == 0) {
            o13.r.b(obj);
            o0 o0Var = this.f72883b;
            String str = o0Var.f72657d;
            if (str == null) {
                y0Var.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                return Unit.INSTANCE;
            }
            y0Var.j(g3.a.c(g3.f35298f));
            iz0.a aVarH4 = o0Var.H4();
            long j8 = Long.parseLong(str);
            this.f72882a = 1;
            obj = aVarH4.r(this.f72885d, j8, this);
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
        if (v2Var instanceof v2.b) {
            wg0.a aVar2 = (wg0.a) ((v2.b) v2Var).f47386a;
            if (aVar2 == null) {
                y0Var.j(g3.a.a(g3.f35298f, null, new UnavailableReasonUnknownException(), null, null, 13));
            } else {
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(aVar2));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            y0Var.j(g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
        }
        return Unit.INSTANCE;
    }
}
