package ym0;

import com.garmin.android.apps.connectmobile.group.service.model.JoinGroupResponseDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/group/service/model/JoinGroupResponseDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$joinGroup$2", f = "GroupRepo.kt", l = {322}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.l<t13.d<? super c83.a0<JoinGroupResponseDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f197985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f197986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(String str, a aVar, t13.d<? super k0> dVar) {
        super(1, dVar);
        this.f197985b = str;
        this.f197986c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k0(this.f197985b, this.f197986c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<JoinGroupResponseDTO>> dVar) {
        return ((k0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197984a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        String strValueOf = String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
        String str = this.f197985b;
        o53.i0<c83.a0<JoinGroupResponseDTO>> i0VarB = this.f197986c.f197888b.B(str, strValueOf, new com.garmin.android.apps.connectmobile.group.service.model.c(str, null, strValueOf));
        this.f197984a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
