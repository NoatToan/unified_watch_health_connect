package am;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/i0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.DivingRepository$getDiveAsync$2", f = "DivingRepository.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class y1 extends v13.i implements e23.l<t13.d<? super c83.a0<ps.i0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f4381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(long j8, Long l14, t13.d<? super y1> dVar) {
        super(1, dVar);
        this.f4380b = j8;
        this.f4381c = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new y1(this.f4380b, this.f4381c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ps.i0>> dVar) {
        return ((y1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4379a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ps.i0>> i0VarB = ((mj0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GCS, mj0.a.class, new c83.h.a[0], null, null, null, 120)).b(this.f4380b, this.f4381c);
        this.f4379a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
