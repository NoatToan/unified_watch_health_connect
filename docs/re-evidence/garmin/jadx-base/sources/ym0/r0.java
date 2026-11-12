package ym0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lwm0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$sendGroupMemberRequest$2", f = "GroupRepo.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.l<t13.d<? super c83.a0<wm0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f198041c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(a aVar, long j8, t13.d<? super r0> dVar) {
        super(1, dVar);
        this.f198040b = aVar;
        this.f198041c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new r0(this.f198040b, this.f198041c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<wm0.c>> dVar) {
        return ((r0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198039a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<wm0.c>> i0VarQ = this.f198040b.f197888b.q(this.f198041c);
        this.f198039a = 1;
        Object objAwait = i0VarQ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
