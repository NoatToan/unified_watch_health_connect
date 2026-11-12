package h10;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.group.service.model.JoinGroupResponseDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ym0.k0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.GroupsViewModel$joinGroup$1", f = "GroupsViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super v2<? extends JoinGroupResponseDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f80786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f80787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, String str, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f80786b = oVar;
        this.f80787c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f80786b, this.f80787c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends JoinGroupResponseDTO>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80785a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ym0.a aVar2 = this.f80786b.f80798b;
        this.f80785a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new k0(this.f80787c, aVar2, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
