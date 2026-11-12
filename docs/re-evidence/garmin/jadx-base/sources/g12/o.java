package g12;

import androidx.lifecycle.t0;
import av.a0;
import av.z;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/t0;", "Lzy0/p;", "", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.UserProfileViewModel$fetchLatestEarnedBadges$1", f = "UserProfileViewModel.kt", l = {323, 323}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<t0<zy0.p<? extends List<? extends com.garmin.android.apps.connectmobile.badges.service.model.m>>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t0 f74908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f74910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.i f74911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f74912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f74913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.android.apps.connectmobile.userprofile.i iVar, String str, int i14, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f74911d = iVar;
        this.f74912e = str;
        this.f74913f = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f74911d, this.f74912e, this.f74913f, dVar);
        oVar.f74910c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(t0<zy0.p<? extends List<? extends com.garmin.android.apps.connectmobile.badges.service.model.m>>> t0Var, t13.d<? super Unit> dVar) {
        return ((o) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o oVar;
        t0 t0Var = (t0) this.f74910c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f74909b;
        if (i14 != 0) {
            if (i14 == 1) {
                t0Var = this.f74908a;
                o13.r.b(obj);
                oVar = this;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        av.g gVar = (av.g) this.f74911d.f46754f.getValue();
        this.f74910c = null;
        this.f74908a = t0Var;
        this.f74909b = 1;
        zy0.b bVar = gVar.f13087d;
        String str = this.f74912e;
        int i15 = this.f74913f;
        oVar = this;
        obj = zy0.b.b(bVar, new z(gVar, str, i15, null), new a0(), false, String.format(zy0.a.GET_LATEST_EARNED_BADGES.f207440a, Arrays.copyOf(new Object[]{str, new Integer(i15)}, 2)), null, oVar, 52);
        if (obj != aVar) {
        }
        return aVar;
        oVar.f74910c = null;
        oVar.f74908a = null;
        oVar.f74909b = 2;
    }
}
