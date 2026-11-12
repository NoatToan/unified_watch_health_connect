package uu;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getUserProfileInfo$1", f = "BadgesViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f172800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.userprofile.model.q>> f172801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f172802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f172803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y0<g3<com.garmin.android.apps.connectmobile.userprofile.model.q>> y0Var, q qVar, String str, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f172801c = y0Var;
        this.f172802d = qVar;
        this.f172803e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        z zVar = new z(this.f172801c, this.f172802d, this.f172803e, dVar);
        zVar.f172800b = obj;
        return zVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f172800b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172799a;
        y0<g3<com.garmin.android.apps.connectmobile.userprofile.model.q>> y0Var = this.f172801c;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            ru.d dVar = this.f172802d.f172744i;
            this.f172800b = b0Var;
            this.f172799a = 1;
            obj = dVar.i(this.f172803e, this);
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
            v2.b bVar = (v2.b) v2Var;
            com.garmin.android.apps.connectmobile.userprofile.model.q qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) bVar.f47386a;
            if (bVar.f47387b == 204 || qVar.getUserId() == 0) {
                BizOperationException bizOperationException = new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                y0Var.j(g3.a.a(g3.f35298f, bizOperationException.getMessage(), bizOperationException, null, null, 12));
            } else {
                com.garmin.android.apps.connectmobile.userprofile.model.c userInfo = qVar.getUserInfo();
                if ((userInfo != null ? userInfo.getDisplayName() : null) == null) {
                    BizOperationException bizOperationException2 = new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                    y0Var.j(g3.a.a(g3.f35298f, bizOperationException2.getMessage(), bizOperationException2, null, null, 12));
                } else {
                    g3.f35298f.getClass();
                    y0Var.j(g3.a.d(qVar));
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            Exception exc = ((v2.a) v2Var).f47383a;
            String strH = f3.h(exc, "GET User Profile Info -> server call failed =[", "]");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "BadgesViewModel", strH);
            y0Var.j(g3.a.a(g3.f35298f, exc.toString(), null, null, null, 14));
        }
        return Unit.INSTANCE;
    }
}
