package ym0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupConnectionsListDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupConnectionsListDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupConnections$2", f = "GroupRepo.kt", l = {194}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.l<t13.d<? super c83.a0<GroupConnectionsListDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.k> f198090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(a aVar, String str, List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> list, t13.d<? super x> dVar) {
        super(1, dVar);
        this.f198088b = aVar;
        this.f198089c = str;
        this.f198090d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new x(this.f198088b, this.f198089c, this.f198090d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<GroupConnectionsListDTO>> dVar) {
        return ((x) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198087a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        zm0.a aVar2 = this.f198088b.f197888b;
        List<com.garmin.android.apps.connectmobile.userprofile.model.k> list = this.f198090d;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.userprofile.model.k) it.next()).name());
        }
        o53.i0<c83.a0<GroupConnectionsListDTO>> i0VarD = aVar2.D(this.f198089c, arrayList);
        this.f198087a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
