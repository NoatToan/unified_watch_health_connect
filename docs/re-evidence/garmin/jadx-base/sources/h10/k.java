package h10;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupListDTO;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupListDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.GroupsViewModel$getAllGroups$1", f = "GroupsViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.l<t13.d<? super v2<? extends GroupListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f80782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f80783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f80784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, String str, boolean z14, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f80782b = oVar;
        this.f80783c = str;
        this.f80784d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f80782b, this.f80783c, this.f80784d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends GroupListDTO>> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80781a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        jm0.b bVar = this.f80782b.f80797a;
        this.f80781a = 1;
        Object objU = bVar.u(this.f80783c, this.f80784d, this);
        return objU == aVar ? aVar : objU;
    }
}
