package ym0;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$editGroup$2", f = "GroupRepo.kt", l = {428}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super c83.a0<GroupDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupDTO f197990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar, String str, GroupDTO groupDTO, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f197988b = aVar;
        this.f197989c = str;
        this.f197990d = groupDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f197988b, this.f197989c, this.f197990d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<GroupDetailsDTO>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197987a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<GroupDetailsDTO>> i0VarU = this.f197988b.f197888b.u(this.f197989c, this.f197990d);
        this.f197987a = 1;
        Object objAwait = i0VarU.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
