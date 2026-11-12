package uu;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesViewModel$getConnectionBadgeDetails$1", f = "BadgesViewModel.kt", l = {99, 103}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.m f172771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f172773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.m>> f172774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f172775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f172776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.m>> y0Var, q qVar, String str, int i14, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f172774d = y0Var;
        this.f172775e = qVar;
        this.f172776f = str;
        this.f172777g = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v(this.f172774d, this.f172775e, this.f172776f, this.f172777g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.badges.service.model.m mVar;
        int i14;
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar;
        String str;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f172773c;
        q qVar = this.f172775e;
        y0<g3<com.garmin.android.apps.connectmobile.badges.service.model.m>> y0Var = this.f172774d;
        if (i15 == 0) {
            o13.r.b(obj);
            y0Var.j(g3.a.c(g3.f35298f));
            zu.i iVar = qVar.f172736a;
            this.f172773c = 1;
            obj = iVar.a(this.f172777g, this.f172776f, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = this.f172772b;
            mVar = this.f172771a;
            o13.r.b(obj);
        }
        lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(i14, (Map) obj);
        if (lVar != null || (profileImageUrls = lVar.getProfileImageUrls()) == null) {
            str = null;
        } else {
            str = profileImageUrls.f46880i;
        }
        com.garmin.android.apps.connectmobile.badges.service.model.m mVarD = com.garmin.android.apps.connectmobile.badges.service.model.m.d(mVar, null, str, 7679);
        g3.f35298f.getClass();
        y0Var.j(g3.a.d(mVarD));
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            mVar = (com.garmin.android.apps.connectmobile.badges.service.model.m) ((v2.b) v2Var).f47386a;
            int badgeOwnerId = mVar.getBadgeOwnerId();
            a22.i iVar2 = qVar.f172743h;
            List<String> listC = p13.w.c(String.valueOf(badgeOwnerId));
            List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC2 = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_THUMBNAIL);
            this.f172771a = mVar;
            this.f172772b = badgeOwnerId;
            this.f172773c = 2;
            Object objA = iVar2.a(listC, listC2, this);
            if (objA != aVar) {
                i14 = badgeOwnerId;
                obj = objA;
                lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(i14, (Map) obj);
                if (lVar != null) {
                    str = null;
                } else {
                    str = null;
                }
                com.garmin.android.apps.connectmobile.badges.service.model.m mVarD2 = com.garmin.android.apps.connectmobile.badges.service.model.m.d(mVar, null, str, 7679);
                g3.f35298f.getClass();
                y0Var.j(g3.a.d(mVarD2));
            }
            return aVar;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar2 = (v2.a) v2Var;
        y0Var.j(g3.a.a(g3.f35298f, aVar2.f47383a.toString(), aVar2.f47383a, null, aVar2.f47384b, 4));
        return Unit.INSTANCE;
    }
}
